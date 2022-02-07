package uri.dam.projecteiu;

import java.util.HashMap;
import java.util.Map;

public class Torneig {
    public String uid;
    public String author;
    public String authorPhotoUrl;
    public String content;
    public String mediaUrl;
    public String mediaType;
    /*public Timestamp timestamp;*/
    public Map<String, Boolean> likes = new HashMap<>();
    // Constructor vacio requerido por Firestore
    public Torneig() {}
    public Torneig(String uid, String author, String authorPhotoUrl, String
            content, String mediaUrl, String mediaType) {
        this.uid = uid;
        this.author = author;
        this.authorPhotoUrl = authorPhotoUrl;
        this.content = content;
        this.mediaUrl = mediaUrl;
        this.mediaType = mediaType;
       /* Long datetime = System.currentTimeMillis();
        this.timestamp=new Timestamp(datetime);*/
    }
}
