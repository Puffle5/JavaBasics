package photosExample;
import java.io.FileInputStream;
public class PhotoAlbum
{private int pagesCount;
private FileInputStream[] photos;
public PhotoAlbum(int pagesCount, FileInputStream[] photos) throws Exception
{if (photos.length>pagesCount*3) {throw new Exception("Too many photos!");}
if (pagesCount<10) {throw new Exception("Not enough pages!");}
this.pagesCount = pagesCount;
this.photos = new FileInputStream[pagesCount*3];
for (int a=0; a<photos.length; a++)
{this.photos[a] = photos[a];}}
public PhotoAlbum()
{this.photos = null; this.pagesCount = 16;}
static boolean equalPhotos (FileInputStream photo1, FileInputStream photo2) throws Exception
{int counter1, counter2;
while ((counter1 = photo1.read()) != -1)
{counter2 = photo2.read();
if (counter1 != counter2) {return false;}
} return true;}
FileInputStream[] getDuplicates() throws Exception
{FileInputStream[] duplicates = new FileInputStream[0];
for (int i=0;i<photos.length;i++)
{for (int x=i+1; x<photos.length; x++)
{if (equalPhotos(photos[i], photos[x]) == true)
{FileInputStream[] help = new FileInputStream[duplicates.length+1];
for (int a=0;a<duplicates.length; a++)
{help[a] = duplicates[a]; help[help.length-1] = photos[i];
duplicates = help;}
break;}}}
return duplicates;}
void addNewPhoto(FileInputStream newPhoto) throws Exception
{FileInputStream[] duplicates = this.getDuplicates();
if (duplicates.length>0)
{FileInputStream duplicatePicture = duplicates[0];
for (int a=0; a<this.photos.length; a++)
{if (equalPhotos(duplicatePicture, photos[a]) == true)
{photos[a] = newPhoto; break;}}}
else {for (int a=0; a<photos.length; a++)
{if (photos[a] == null) {photos[a] = newPhoto; return;}}
throw new Exception("No room in the album!");}}
}
