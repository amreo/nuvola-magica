package loc.amreo.nuvolamagica.containerbackend;

import loc.amreo.nuvolamagica.controllers.frontendcommandsobject.CompilationRequest;
import loc.amreo.nuvolamagica.controllers.frontendcommandsobject.CompilationResponse;

public interface CommunicationDriver {

	void uploadFile(String communicationEndpoint, String filename, byte[] content);
	void deleteFile(String communicationEndpoint, String filename);
	boolean existFile(String communicationEndpoint, String filename);
	byte[] getFile(String communicationEndpoint, String filename);
	CompilationResponse build(String communicationEndpoint, CompilationRequest compilationRequest);
}
