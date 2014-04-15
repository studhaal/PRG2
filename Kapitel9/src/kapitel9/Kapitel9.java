/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel9;

/**
 *
 * @author studhaal
 */
public class Kapitel9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewsFeed nf = new NewsFeed();
        Post mp1 = new MessagePost("studhaal", "Hallo");
        Post pp1 = new PhotoPost("studhaal", "filename.jpg", "caption");
        nf.addPost(mp1);
        nf.addPost(pp1);
        nf.show();
    }
}
