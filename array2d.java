public class array2d {
    public static void main(String[] args) {
        String[][] data_mahasiswa = { { "kamhar", "2020117", "heaven", "Jomblo" },
                { "handsome", "2020118", "amerika", "nikah" }, { "tamvan", "2020119", "korea", "duda" } };

        String status_kamhar = data_mahasiswa[0][3];
        String handsome_NIM = data_mahasiswa[1][1];

        int[][] bilangan_prima = { { 2, 3, 5, 7, 23 }, { 11, 13, 17, 19 } };

        int prima = bilangan_prima[1][2];

        System.out.println("dibawah ini adalah bilangan prima");
        for (int i = 0; i < bilangan_prima.length; i++) {
            for (int j = 0; j < bilangan_prima[i].length; j++) {
                System.out.println(bilangan_prima[i][j]);
            }
        }

        System.out.println("kamhar status: " + status_kamhar);
        System.out.println("handsome NIM: " + handsome_NIM);
        System.out.println("bilangan prima baris ke-2 kolom ke-3: " + prima);

    }
}