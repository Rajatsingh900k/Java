package FileHandling;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;
// streams are nothing but abstract classes
//Sttream is a sequence of data, it can be byte or characters(unicode)
//streams are just abstraction that java provides.
//Stream is linked to a phyican device like keyboard or mouse.
//java imprement these within class hierrachy in java.util.IO package.

// Scanner sc = new Scanner(System.in);
    // java have two types of streams in java
    // 1. Byte stream.(ending with stream)
    // 2. character classes(ending with reader or writer)
    
    //1. Byte stream a) Input Stream and b) output Stream
    //2. CHaracter stream a) Reader and b) writter
    //charracter stream is more effivient then byte stream as they are unicode.

    // Byte stream are used for byte data like audio
    // if dealing with character ---> chacter stream

    //inputStream->read data
    //outputStream->write data
    // predefined byte streams in java -> System.out(console), System.in(Keyboard),System.err(console)
public class Main {
    public static void main(String[] args) {
        // try(InputStreamReader isr = new InputStreamReader(System.in)){
                // byte stream is converted into character stream
        //     System.out.println("Enter some letters");
        //     int letters=isr.read();
        //     while(isr.ready()){
        //         System.out.println((char)letters);
        //         letters=isr.read();
        //     }
        //     isr.close();
        //     System.out.println();
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }


        // try(FileReader fr = new FileReader("Note.txt")){
        //     System.out.println("Enter some letters");
        //     int letters=fr.read();
        //     while(fr.ready()){
        //         System.out.println((char)letters);
        //         letters=fr.read();
        //     }
        //     fr.close();
        //     System.out.println();
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        // //byto to char streeam and then bufferedReader is reading that character stream
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
        //     System.out.println("You Typed: "+br.readLine());
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
        
        // readfiles
        try(BufferedReader br = new BufferedReader(new FileReader("Note.txt"))){
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
