/*
 * Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.





Senaryo
Matris : 
2    3    4    
5    6    4    
Transpoze : 
2    5    
3    6    
4    4    


Matris : 
1    2    3    
4    5    6    
Transpoze : 
1    4    
2    5    
3    6    
 */
public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] normalDizi = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
        int[][] transpozuAlinmisDizi = new int[normalDizi.length][normalDizi.length];

        transpozuAlinmisDizi[0][0] = normalDizi[0][0];

        for (int i = 0; i < normalDizi.length; i++) {
            for (int j = 0; j < normalDizi.length; j++) {
                transpozuAlinmisDizi[j][i] = normalDizi[i][j];
            }
        }
        System.out.println("Normal Matris: ");
        for (int[] satir : normalDizi) {
            for (int sutun : satir) {
                System.out.print(sutun + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Transpozu alınmış Matris: ");

        for (int[] satir : transpozuAlinmisDizi) {
            for (int sutun : satir) {
                System.out.print(sutun + " ");
            }
            System.out.println(" ");
        }

    }
}
