package com.example.postlee.enity;

public class Post {
	private int idpost;
    private String titulo;
    private String descripcion;
    
	public Post() {
		super();
	}

	public Post(int idpost, String titulo, String descripcion) {
		super();
		this.idpost = idpost;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}

	public int getIdpost() {
		return idpost;
	}

	public void setIdpost(int idpost) {
		this.idpost = idpost;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    
    
}
