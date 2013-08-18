package com.android2d.gameframework.api.fileio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * User: serg
 * Date: 8/18/13
 * Time: 7:11 PM
 */
public interface FileIO {

    public InputStream readAsset(String fileName) throws IOException;

    public InputStream readFile(String fileName) throws IOException;

    public OutputStream writeFile(String fileName) throws IOException;

}
