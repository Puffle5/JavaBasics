package photosExample;
import java.io.FileInputStream;
public class BigPhotoAlbum extends PhotoAlbum
{public BigPhotoAlbum (int pagesCount, FileInputStream[] photos) throws Exception
{super(pagesCount, photos);
if (pagesCount<64) {throw new Exception("Not enough pages!");}}}
