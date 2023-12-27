import fileTypes.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 27/12/2023 05:15
 */

public class Main {
    public static void main(String[] args) {
        List<CustomFile> list = new ArrayList<>();
        list.add(new PDFFile());
        list.add(new JSONFile());
        list.add(new XMLFile());
        list.add(new PDFFile());
        list.add(new XMLFile());

        FileType type = new FileExporter();
        for(CustomFile file : list){
            file.download(type);
        }
    }
}