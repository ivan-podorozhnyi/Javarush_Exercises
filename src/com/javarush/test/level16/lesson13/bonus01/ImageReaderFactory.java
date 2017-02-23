package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Ivan on 28.04.2016.
 */
public class ImageReaderFactory {


    public static ImageReader getReader(ImageTypes jpg) {
        ImageReader newItem;

        if (jpg == ImageTypes.JPG){
            newItem=new JpgReader();
        }
        else if (jpg == ImageTypes.BMP){
            newItem=new BmpReader();
        }
        else if (jpg == ImageTypes.PNG){
            newItem=new PngReader();
        }


        else
        throw new IllegalArgumentException("Неизвестный тип картинки");

        return newItem;


    }
}
