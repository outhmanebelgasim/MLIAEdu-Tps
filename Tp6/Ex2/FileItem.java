package Tp6.Ex2;

public class FileItem extends FsItem {
    private long size;

    public FileItem(String name, long size) {
        super(name);
        this.size = size;
    }

    public long getSize() {
        return size;
    }
}
