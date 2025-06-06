interface CloudStorageProvider {
    void uploadFiles(String filename, int size);
}
class GoogleDrive implements CloudStorageProvider {
    public void uploadFiles(String filename, int size) {
        System.out.println("Uploading '" + filename + "' (" + size + "MB) to Google Drive...");
    }
}
class Dropbox implements CloudStorageProvider {
    public void uploadFiles(String filename, int size) {
        System.out.println("Uploading '" + filename + "' (" + size + "MB) to Dropbox...");
    }
}
public class cloud {
    public static void main(String[] args) {
        CloudStorageProvider google = new GoogleDrive();
        CloudStorageProvider dropbox = new Dropbox();
        google.uploadFiles("project.zip", 120);
        dropbox.uploadFiles("report.pdf", 5);
    }
}
