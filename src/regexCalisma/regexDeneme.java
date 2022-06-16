package regexCalisma;

import java.util.regex.*;

/**
 * Düzenli ifadeler için aşağıdaki karakterlerin özel bir anlamı vardır, eğer bu karakterler özel anlamı dışında kullanılmak istiyorlarsa "^" işareti kullanılmalıdır.
 * <([{\^-=$!|]})?*+.>
 *
 *    .	    /n dışındaki herhangi bir karakter
 *    *	    Solundaki karakterden 0 tane yada çok tane
 *    +	    Solundaki karakterden 1 tane yada çok tane
 *    ?	    Solundaki karakterden 0 tane yada 1 tane
 *    {n}	Solundaki karakterden tam olarak n tane
 *    {n,}	burada n bir sayıdır, solundaki karakterden en az n tane
 *    {n,m}	solundaki karakterden en az n tane, en fazla m tane
 *    [ ]	içerisindeki karakterlerden herhangi birisi
 *    x-y	x ve y aralığındaki herhangi bir karakter
 *          köşeli parantez içerisindeki olmayan herhangi bir karakter
 *    \w	herhangi bir alfa numerik karakter
 *    \W	Alfa numerik olmayan karakter
 *    \s	herhangi bir boşluk karakteri(whitespace)
 *    \S	herhangi bir boşluk olmayan karakter
 *    $	    satırın sonunun belli karakterlerle sonlanması durumu
 *    ^	    satır başı belli karakterlerle başlaması durumu
 *    (...)	gruplama amacında kullanılır böylece bunun sağındaki meta karakterler bir grup içib anlam kazanır
 *    I	    veya anlamına gelmektedir
 *    /d	digitin kısaltılması, herhangi bir sayısal karakter
 *    /D	sayısal karakter olmayan
 *
 *
 *    [0-9]	                 0 ile 9 arasındaki rakamlardan herhangi birisi varsa al
 *    [a-zA-Z]	             Büyük veya küçük harf olan herhangi bir İngilizce alfabedeki karakter
 *    [a-zA-ZçğıöşüÇĞIOÖŞÜ]	 Büyük veya küçük harf olan herhangi bir Türkçe alfabedeki karakter
 *
 *    Bir düzenli ifadede doğrudan bulunan bir karakter özel bir anlam ifade etmiyor ise
 *    kalıp içerisine doğrudan dahil edilmiştir. Örn: [a-zA-Z]@
 *
 */

public class regexDeneme {

    public static void main(String[] args)
    {

        String regex = "[0-9]{2}";
        //String regex = "[0-9]+";
        //String regex = "[^a-zA-Züğçşı, ]+";
        String text = "Bugün hava 30 derece, dün 35 ve  25 dereceydi ayrıca 2";

        /*String regex = "\\d{1,}/\\d{1,}/\\d{2,}";
        String text = "Ben 10/9/1976 yılında doğdum. Kardeşim 12/12/77 yılında doğdu";*/

        /*String regex = "[a-z0-9]+@[a-z0-9]+\\.[a-z]+";
        String text = "Mail adresin abkaytan@deneme.org, eski mail adresim abkode@deme.com dur";*/

        Pattern pattern = Pattern.compile(regex);

        Matcher m = pattern.matcher(text);

        //System.out.println(m.matches());

        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }

    }
}
