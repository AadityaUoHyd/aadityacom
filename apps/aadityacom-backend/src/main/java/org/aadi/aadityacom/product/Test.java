package org.aadi.aadityacom.product;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

@RestController
@PostMapping("/test")
public class Test {

  ByteArrayInputStream inputStream = new ByteArrayInputStream(imageBlobFromDb);

  ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

  Thumbnails.of(inputStream).crop(Positions.CENTER)
    .size(500,500)
    .outputFormat("jpeg")
    .toOutputStream(outputStream);

  byte[] croppedImageBytes = outputStream.toByteArray();


  productPictureEntity.setFile(croppedImageBytes);
  repository.save(productPictureEntity);
}
