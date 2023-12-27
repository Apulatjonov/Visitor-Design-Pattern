import fileTypes.FileType;
import fileTypes.JSONFile;
import fileTypes.PDFFile;
import fileTypes.XMLFile;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 27/12/2023 05:15
 */

public class FileExporter implements FileType {
    @Override
    public void generatePDF(PDFFile file) {
//        code related to generate PDF File
    }

    @Override
    public void generateXMLFile(XMLFile file) {
//        code related to generate XML File
    }

    @Override
    public void generateJSONFile(JSONFile file) {
//        code related to generate JSON File
    }
}
