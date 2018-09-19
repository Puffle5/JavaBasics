package photosExample;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class MainClass
{public static void main(String[] arguments) throws Exception
{PhotoAlbum[] albums = new PhotoAlbum[3];
PhotoAlbum object_1 = new PhotoAlbum();
PhotoAlbum object_2 = new PhotoAlbum();
PhotoAlbum object_3 = new BigPhotoAlbum(30, null);
albums[0] = object_1;
albums[1] = object_2;
albums[2] = object_3;
FileInputStream[] duplicates_1 = albums[0].getDuplicates();
FileInputStream[] duplicates_2 = albums[0].getDuplicates();
FileInputStream[] duplicates_3 = albums[0].getDuplicates();
List<FileInputStream> duplicates = new ArrayList<>();
for (int a=0; a<duplicates_1.length; a++)
{for (int b=0; a<duplicates_2.length; b++)
{for (int c=0; a<duplicates_3.length; c++)
{if (PhotoAlbum.equalPhotos(duplicates_1[a], duplicates_2[b]) == true
        && PhotoAlbum.equalPhotos(duplicates_2[b], duplicates_3[c]) == true)
{duplicates.add(duplicates_3[c]);}}}}
FileInputStream[] DuplicatesInAll = new FileInputStream[duplicates.size()];
DuplicatesInAll= duplicates.toArray(DuplicatesInAll);
}}
