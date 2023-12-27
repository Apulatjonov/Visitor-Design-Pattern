package fileTypes;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 27/12/2023 05:15
 */

public interface FileType {
    void generatePDF(PDFFile file);
    void generateXMLFile(XMLFile file);
    void generateJSONFile(JSONFile file);

}
