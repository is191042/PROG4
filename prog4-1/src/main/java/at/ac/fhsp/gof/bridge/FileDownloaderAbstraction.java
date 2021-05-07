package at.ac.fhsp.gof.bridge;

public interface FileDownloaderAbstraction 
{
    public Object download(String path);
     
    public boolean store(Object object);
}
