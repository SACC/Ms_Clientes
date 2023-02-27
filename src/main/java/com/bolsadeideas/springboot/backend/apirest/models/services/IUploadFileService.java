package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

import org.springframework.core.io.UrlResource;
import org.springframework.web.multipart.MultipartFile;

public interface IUploadFileService {
	public UrlResource cargar(String nombreFoto) throws MalformedURLException;
	public String copiar(MultipartFile archivo) throws IOException;
	public boolean  eliminar(String nombreFoto);
	public Path getPath(String nombreFoto);
}
