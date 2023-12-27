package fileTypes;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 27/12/2023 05:15
 */

public class JSONFile implements CustomFile{
    @Override
    public void generate() {
        //custom code
    }

    @Override
    public void download(FileType filetype) {
        System.out.println("JSON File generated!");
        filetype.generateJSONFile(this);
    }

    @Override
    public void upload() {
        //custom code
    }
}
