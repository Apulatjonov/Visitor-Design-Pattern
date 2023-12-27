package fileTypes;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 27/12/2023 05:15
 */

public class PDFFile implements CustomFile {
    @Override
    public void generate() {
        //custom code
    }

    @Override
    public void download(FileType filetype) {
        System.out.println("PDF File generated!");
        filetype.generatePDF(this);
    }

    @Override
    public void upload() {
        //custom code
    }
}
