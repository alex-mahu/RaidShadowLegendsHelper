package utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class FileHelper {
    private static final String SETTINGS_FILE_NAME = "settings.json";

    public static boolean isSettingsFileAccessible() {
        return fileExistsInResources(SETTINGS_FILE_NAME);
    }

    private static boolean fileExistsInResources(String fileNameAndExtension) {
        URI fileUri;
        try {
            fileUri = FileHelper.class.getClassLoader().getResource(fileNameAndExtension).toURI();
        }catch (URISyntaxException ex) {
            return false;
        }
        return Paths.get(fileUri).toFile().exists();
    }
}
