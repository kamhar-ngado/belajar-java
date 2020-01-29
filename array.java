public class array
{
    public static void main(String[] args)
    {
        String[] mata_kuliah = {"bahasa mandarin", "kalkulus ", "geometri", "statistika", "teori pengkodean"};
        mata_kuliah[0] = "[1] aljabar";
        mata_kuliah[1] = "[2] kalkulus";
        mata_kuliah[2] = "[3] geometri";
        mata_kuliah[3] = "[4] statistika";

        int[] nilai_uas = {70, 75, 80, 95, 100};
        nilai_uas[2] = 100;
        nilai_uas[1] = 75;
        nilai_uas[0] = 70;
        nilai_uas[3] = 100;
        

        String ubah0 = "[1] ";
        String ubah1 = "[2] ";
        String ubah2 = "[3] ";
        String ubah3 = "[4] ";
        String ubah4 = "[5] ";

        String ubah_uas0 = ubah0 + nilai_uas[0];
        String ubah_uas1 = ubah1 + nilai_uas[1];
        String ubah_uas2 = ubah2 + nilai_uas[2];
        String ubah_uas3 = ubah3 + nilai_uas[3];
        String ubah_uas4 = ubah4 + nilai_uas[4];

        String[] nilai_uas_baru = {ubah_uas0, ubah_uas1, ubah_uas2, ubah_uas3, ubah_uas4};

        System.out.println(mata_kuliah[0]);
        System.out.println(mata_kuliah[1]);
        System.out.println(nilai_uas[2] + mata_kuliah[2]);
        System.out.println(nilai_uas[2]);
        System.out.println("jumlah mata kuliah: " + mata_kuliah.length);
        System.out.println("jumlah hasil nilai uas: " + nilai_uas.length);

        System.out.println(ubah_uas0);
        System.out.println(ubah_uas1);
        System.out.println(ubah_uas2);
        System.out.println(ubah_uas3);
        System.out.println(ubah_uas4);
    

        System.out.println("+++++++++++++++++batas+++++++++");
        System.out.println("dibawah ini adalah mata kuliah yang saya ambil");
        
        for (int i = 0; i < mata_kuliah.length; i++)
        {
            System.out.println(mata_kuliah[i]);
        }
        
        System.out.println("+++++++++++++++++batas+++++++++");
        System.out.println("dibawah ini adalah nilai uas saya");
       
        for (int j = 0; j < nilai_uas.length; j++)
        {
                System.out.println("nilai uas [" + j + "] " + nilai_uas[j]);
            
        }

        System.out.println("+++++++++++++++++batas+++++++++");
        System.out.println("dibawah ini adalah hasi update nilai uas saya");
        for (int k = 0; k < nilai_uas_baru.length; k++)
        {
            System.out.println(nilai_uas_baru[k]);
        }


        ////for loop ini sama dengan "for (int k = 0; k < nilai_uas_baru.length; k++)"
        System.out.println("+++++++++++++++++batas+++++++++");
        for (String k : nilai_uas_baru)
        {
            System.out.println(k);
        }


    }
}