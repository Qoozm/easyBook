package com.xupt.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class GetEssayContent {

    public static String getEssayContent(String essay_path) {
        File file = new File(essay_path);
        String content = "";
        try {
            if (file.exists()) {
                FileChannel fileChannel = new FileInputStream(essay_path).getChannel();
                ByteBuffer buffer = ByteBuffer.allocate(2048);
                while (fileChannel.read(buffer) > 0) {
                    buffer.flip();
                    content += Charset.forName("UTF-8").decode(buffer);
                    buffer.clear();
                }
                fileChannel.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
