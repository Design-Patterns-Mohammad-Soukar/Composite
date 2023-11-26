/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileexplorer;

/**
 *
 * @author muhammad
 */
public class FileExplorer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Directory rootDir = new Directory("root");
        
        File conf = new File("conf",3);
        
        
        Directory userDir = new Directory("user");
        
        rootDir.addChild(conf);
        rootDir.addChild(userDir);
        
        Directory picDir = new Directory("Pictures");
        
        userDir.addChild(picDir);
        
        File image = new File("myIMage.jpg",1024);
        picDir.addChild(image);
        
        
        System.out.println(userDir.getInfo());
        
        
        
    }
    
}
