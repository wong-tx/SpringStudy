package com.wtx.javademo.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *@Author feri
 *@Date Created in 2018/8/9 23:24
 */
public class ZxingUtil {
    //生成，存储到文件中
    public  static Boolean encode(String contents, String format, int width, int
            height, String saveImgFilePath) {
        Boolean bool = false;
        BufferedImage image = createImage(contents,width,height);
        if (image != null) {
            bool = writeToFile(image, format, saveImgFilePath);
        }
        return bool;
    }
    //生成内容
    public static void encode(String contents, int width, int height) {
        createImage(contents,width, height);
    }

    /**
     * 创建BufferedImage
     * */
    public static BufferedImage createImage(String contents ,int width, int
            height) {
        //1、创建缓存图片对象
        BufferedImage bufImg=null;
        //2、存储图片相关信息
        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>(); //
        //3、设置图片相关信息 比如 分辨率 边距 编码格式等
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H); hints.put(EncodeHintType.MARGIN, 10); hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        try {
            //4、创建位图矩阵 参数说明：1、二维码 内容2、要生成的格式 3、宽 4、高 5、相关信息
            BitMatrix bitMatrix = new MultiFormatWriter().encode(contents,
                    BarcodeFormat.QR_CODE, width, height, hints);
            //5、设置对应的颜色
            MatrixToImageConfig config = new MatrixToImageConfig(0xFF000001,
                    0xFFFFFFFF);
            //6、生成图片
            bufImg = MatrixToImageWriter.toBufferedImage(bitMatrix, config);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bufImg;
    }
    /**
     * 将BufferedImage对象写入到文件中
     *  [png,jpg,bmp]
     */
    @SuppressWarnings("finally")
    public static Boolean writeToFile(BufferedImage bufImg, String format, String
            saveImgFilePath) {
        Boolean bool = false;
        try {
            bool = ImageIO.write(bufImg, format, new File(saveImgFilePath));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return bool;
        }
    }
}