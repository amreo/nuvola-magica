package loc.amreo.nuvolamagica.containerbackend.communication.mock;

import java.nio.charset.StandardCharsets;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

import loc.amreo.nuvolamagica.containerbackend.CommunicationDriver;

@Service
@ConditionalOnExpression("'${nuvolamagica.communication.driver}'=='mock'")
public class MockCommunicationDriver implements CommunicationDriver {

	@Override
	public void uploadFile(String communicationEndpoint, String filename, byte[] content) {
		System.out.println("[MockCommunicationDriver][upload] I think I've uploaded the file " + filename + " with content: " + new String(content, StandardCharsets.UTF_8) + " to " + communicationEndpoint);
	}

	@Override
	public void deleteFile(String communicationEndpoint, String filename) {
		System.out.println("[MockCommunicationDriver][delete] I think I've deleted the file " + filename + " to " + communicationEndpoint);
	}	
}
