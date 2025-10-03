package no.hvl.dat100.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int verdi : rad) {
                System.out.print(verdi + "");

            }
            System.out.println();
        }

    }

    // b)
    public static String tilStreng(int[][] matrise) {

        StringBuilder sb = new StringBuilder();
        for (int[] rad : matrise) {
            for (int verdi : rad) {
                sb.append(verdi).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {

        int[][] ny = new int[matrise.length][matrise[0].length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                ny[i][j] = matrise[i][j] * tall;

            }
        }
        return ny;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {

            // samme objekt? → like
            if (a == b) return true;

            // en er null? → ikke like
            if (a == null || b == null) return false;

            // samme antall rader?
            if (a.length != b.length) return false;

            // sjekk hver rad
            for (int i = 0; i < a.length; i++) {
                int[] ra = a[i];
                int[] rb = b[i];

                // håndter null-rader
                if (ra == rb) continue;          // begge null eller samme referanse
                if (ra == null || rb == null) return false;

                // samme antall kolonner i denne raden?
                if (ra.length != rb.length) return false;

                // sammenlign innhold
                for (int j = 0; j < ra.length; j++) {
                    if (ra[j] != rb[j]) return false;
                }
            }

            // alt likt
            return true;
        }


        // e)
    public static int[][] speile(int[][] matrise) {

        // TODO

        throw new UnsupportedOperationException("Metoden speile ikke implementert");

    }

    // f)



   }