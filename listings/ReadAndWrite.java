import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {

    /**
     * Read a txt file.
     *
     * @param txtFile  the path of the txt file.
     * @param fallback the string to be returned if the txt
     *                 file does not exists.
     * @return the string form of the file content (or the
     *         fallback if such file does not exist).
     */
    public static String read(String txtFile,
            String fallback) {
        try (FileReader fr = new FileReader(txtFile);
                BufferedReader br = new BufferedReader(fr)) {
            StringBuffer sb = new StringBuffer();
            String s = null;
            while ((s = br.readLine()) != null) {
                sb.append(s).append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            return fallback;
        }
    }

    /**
     * Write a string to a file.
     *
     * @param txtFile the txt file to be written to.
     * @param str     the string to be written.
     * @param append  if {@code true}, then data will be
     *                written to the end of the file rather
     *                than overriding the original file.
     * @return {@code true} if and only if the operation
     *         is executed successfully.
     */
    public static boolean write(String txtFile,
            String str,
            boolean append) {
        File f = new File(txtFile);
        try {
            /* create folders if necessary */
            f.getParentFile().mkdirs();
            f.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        /* "catch" does nothing */
        try (FileWriter fw = new FileWriter(f, append);
                BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(str);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
