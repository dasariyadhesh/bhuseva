package com.bhuseva.backend.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Author: Yadhesh DG © Bhuseva Public Charitable Trust
 */
public class FileUploadUtil {

	public static String saveFile(String uploadDir, String fileName, byte[] bytes) throws IOException {
		Path uploadPath = Paths.get(uploadDir);
		if (!Files.exists(uploadPath))
			Files.createDirectories(uploadPath);

		Path filePath = uploadPath.resolve(fileName);
		Files.write(filePath, bytes);

		return filePath.toString();
	}
}
