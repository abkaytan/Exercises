package mySQL;

import java.sql.*;
import java.util.Scanner;

/*Database Transaction

    Çoğu zaman programlarımızda bir çok veritabanı işlemini ard arda yaparız.
    Örneğin elimizde birbiriyle bağlantılı 3 tane tablo güncelleme işlemimiz var(delete,update).
    Bu işlemleri ve sorguları ard arda çalıştırdığımızı düşünelim.

    statement.executeUpdate(sorgu1);
    statement.executeUpdate(sorgu2); // Burada herhangi bir hata oldu ve programımız sona erdi.
    statement.executeUpdate(sorgu3);


    Böyle bir durumda 2.sorgumuzda herhangi bir hata oluyor.
    Ancak 1.sorguda hata olmadığı için bu sorgumuz veritabanımızı güncelledi.
    Ancak bu sorgular birbiriyle bağlantılı ise 1.sorgunun da çalışmaması gerekiyor.
    İşte biz böyle durumların önüne geçmek için Transactionları kullanıyoruz.

    (ATM Örneği)

    Transaction mantığını kullanmak için bu sorguların sadece hiçbir sorun oluşmadığında
    toplu çalışmasını istiyoruz.

    Java bu sorguları yazdığımız andan itibaren otomatik olarak sorguları sorgusuz sualsiz
    çalıştırır. Onun için ilk olarak con.setAutoCommit(false) şeklinde bir şey yaparak bu durumu
    engelliyoruz.

    commit() : Bütün sorguları çalıştır. Sorun olmadığı zaman hepsini çalıştırmak için kullanıyoruz.
    rollback(): Bütün sorguları iptal et. Sorun olduğu zaman hiçbirini çalıştırmamak için kullanıyoruz.


    Yani bu sefer programlarımızı biraz daha güvenli yazmış oluyoruz.

    Not : setAutoCommit(false) yazsak bile Veritabanını güncellemeyen bir sorgumuz varsa,
    herhangi bir güvenlik sıkıntı olmayacağından çalıştırılır.
    */

public class Baglanti {

    private String kullanici_adi="root";
    private String parola = "";

    private String db_ismi = "demo";

    private String host = "localhost";

    private int port = 3306;

    private Connection con = null;



    //sql komuntlarını kullanabilmek için uygulanan komutlar
    private Statement statement = null;

    private PreparedStatement preparedStatement = null;


    public void CommitveRollback() {

        Scanner scanner = new Scanner(System.in);


        try {
            con.setAutoCommit(false); // burayı false yaptığımız için aşşağıdaki if else döngüsünde commit ile
            // sorgularımızı çalıştıracağımızı söylüyoruz.  sorgular : "statement executeUp....sorgu1 ve sorgu2"
            String sorgu1 = "Delete from calisanlar where id = 3";
            String sorgu2 = "Update calisanlar set email = 'deneme@gmail.com' where id = 1 ";

            System.out.println("güncellenmeden önce");
            calisanlariGetir(); // calisanlarıgetir metodunumuz veri çekme işlemi yaptığı için
            // yani güncelleme işlemi yapmadığı için autocommiti false yapsak bile çalışır

            Statement statement = con.createStatement();

            statement.executeUpdate(sorgu1);
            statement.executeUpdate(sorgu2);

            // eğer burada setAutoCommit i false yapmasaydık üstteki iki statement executeupdate komutları çalıştırılacaktı
            // ancak şu an biz bunları istediğimiz zaman çalıştırabiliriz.

            System.out.println("işlemleriniz kaydedilsin mi ? (yes/no)");
            String cevap = scanner.nextLine();

            if(cevap.equals("yes")) {
                con.commit(); // commit yaptıktan sonra yukardaki  statement executeUp....sorgu1 ve sorgu2 çalışacak
                calisanlariGetir();
                System.out.println("veri tabanı güncellendi.");
            }
            else {

                //herhangi bir hata oluşturulması durumunda sorguların komple çalışmasını istemiyorsak
                // bunu rollback ile sağlarız mesele sorgu2 de hata çıkarsa sorgu1 de iptal edilir.
                con.rollback();
                System.out.println("veri tabanı güncellenmesi iptal edildi");
                calisanlariGetir();

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void preparedCalisanlariGetir(int id){
        String sorgu = "Select * from calisanlar where id > ? and ad like ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id); // yukardaki 1. ? işareti yerine id geleceğini belirttik
            preparedStatement.setString(2,"M%"); // sorgudaki 2. ? işareti yerine M% getiriliyor(m ile başlayanlar)

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");

                System.out.println("Ad: " + ad + " Soyad: " + soyad + " email: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void calisanSil() {
        try {
            statement = con.createStatement();

            String sorgu = "Delete from calisanlar where id > 3";

            int deger = statement.executeUpdate(sorgu);
            System.out.println(deger + "kadar veri silindi");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void calisanEkle () {
        try {
            statement = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String ad = "Ahmet";
        String soyad = "Ağtaş";
        String email = "ahmetay@gmail.com";
        //Inset Into calisanlar (ad,soyad,email) VALUES('Mehmet','Kaplan','Kame@gmail.com')
        String sorgu = "Insert Into calisanlar (ad,soyad,email) VALUES( " + "'" + ad + "'," + "'" + soyad + "'," + "'" +  email + "' )";
        //prepared statement kullanılarak daha kolay şekilde syntax hatasına sebep olmayacak şekilde yazılabilir.
        try {
            statement.executeUpdate(sorgu); // veri tabanını güncelleme işlemi yapılmış oldu
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void calisanGuncelle() {
        try {
            statement = con.createStatement();

            String sorgu = "Update calisanlar Set email = 'abk@gmail.com' where id = 1";
            statement.executeUpdate(sorgu);
            String sorgu1 = "Update calisanlar Set email = 'nomail@gmail.com' where id > 3";
            statement.executeUpdate(sorgu1);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void calisanlariGetir() {

        String sorgu = "Select * from calisanlar"; // SQL KOMUTU - calışan tablosundaki bütün
        // verileri alma isteği, * ise bütün verileri almak için kullanılır

        try {
            statement = con.createStatement(); // connection üzerinden bir tane statement oluşturma işlemi
            ResultSet rs =  statement.executeQuery(sorgu); // statement'da sorgu çalıştırma işlemi -executeQuery-
            // executeQuery resultset return u verdiği için bir resultsetden nesne oluşturduk
            while (rs.next()) { // daha okuyacağımız veri var mı sorgusu üzerinden true olduğu sürece çalışır
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");

                System.out.println("ID: " + id + " ISIM: " + ad + " SOYAD: " +soyad+ " EMAIL: " + email );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public Baglanti() {

        //            jdbc:mysql://localhost:3306/demo
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
        //?useUnicode kısmı türkçe karakterlerin mysql kısmına aktarılmasında sıkıntı çıkmaması için eklendi

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("driver bulunamadı...");
        }

        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("bağlantı başarılı");

        } catch (SQLException e) {
            System.out.println("bağlantı başarısız...");
        }

    }

    public static void main(String[] args) {



        Baglanti baglanti = new Baglanti();
        baglanti.CommitveRollback();


        //baglanti.preparedCalisanlariGetir(1);


        /*
        System.out.println("Silinmeden önce ");
        baglanti.calisanlariGetir();
        System.out.println("*********************");
        System.out.println("silindikten sonra ...");
        //baglanti.calisanGuncelle();
        baglanti.calisanSil();
        baglanti.calisanlariGetir();


        //baglanti.calisanEkle();
        //baglanti.calisanlariGetir();

         */



    }


}
