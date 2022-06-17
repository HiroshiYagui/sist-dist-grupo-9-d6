package com.example.soap.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.howtodoinjava.xml.school.EstudianteDetailsRequest;
import com.howtodoinjava.xml.school.EstudianteDetailsResponse;

@Endpoint
public class EstudianteEndpoint {
	private static final String NAMESPACE_URI = "http://www.howtodoinjava.com/xml/school";

	private EstudianteRepositorio EstudianteRepository;

	@Autowired
	public EstudianteEndpoint(EstudianteRepositorio EstudianteRepository) {
		this.EstudianteRepository = EstudianteRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "EstudianteDetailsRequest")
	@ResponsePayload
	public EstudianteDetailsResponse getEstudiante(@RequestPayload EstudianteDetailsRequest request) {
		EstudianteDetailsResponse response = new EstudianteDetailsResponse();
		response.setEstudiante(EstudianteRepository.findEstudiante(request.getNombre()));

		return response;
	}
}