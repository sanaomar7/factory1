public class ConnectionFactory {

    public static final int Ftp = 1 ;
    public static final int Ssh = 2 ;
    public static final int Scp = 3 ;
    public static final int Telnet= 4 ;
    public static Connection per( int ProtocolId ){
        switch (ProtocolId){
            case Ftp :
                return new FTP() ;
            case  Ssh :
                return new SSH() ;
            case Scp:
                return new SCP() ;
            case Telnet:
                return new TELNET() ;
            default:
                return null ;
        }
    }
}
