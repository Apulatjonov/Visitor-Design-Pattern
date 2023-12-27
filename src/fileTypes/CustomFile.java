package fileTypes;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 27/12/2023 05:15
 */
public interface CustomFile {
    void generate();

    void download(FileType filetype);

    void upload();
}
