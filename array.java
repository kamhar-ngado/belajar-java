public class array
{
    public static void main(String[] args)
    {
        String[] mata_kuliah = {"bahasa mandarin", "kalkulus ", " geometri", "statistika"};
        mata_kuliah[0] = "aljabar";
        int[] nilai_uas = {70, 75, 80, 95};
        nilai_uas[2] = 100;


        System.out.println(mata_kuliah[0]);
        System.out.println(mata_kuliah[1]);
        System.out.println(nilai_uas[2] + mata_kuliah[2]);
        System.out.println(nilai_uas[2]);

    }
}