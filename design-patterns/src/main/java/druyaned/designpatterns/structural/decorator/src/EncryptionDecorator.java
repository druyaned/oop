package druyaned.designpatterns.structural.decorator.src;

/**
 * Concrete decorator to encrypt and decrypt the data.
 * @author druyaned
 */
public class EncryptionDecorator extends DataSourceDecorator {
    
    public EncryptionDecorator(DataSource source) {
        super(source);
    }
    
    @Override public void writeData(String data) {
        super.writeData("[ENCRYPTED]\n" + data);
    }
    
    @Override public String readData() {
        return "[DECRYPTED]\n" + super.readData();
    }
    
}
