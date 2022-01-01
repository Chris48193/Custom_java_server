package pruefung;

import pruefung.JSONCodec.JSONCodecException;

public interface JSONCodec {
	
	public String toJson();
    public void fromJson(String json) throws JSONCodecException;

    class JSONCodecException extends  Exception {
        public JSONCodecException(String message){
            super(message);
        }
    }

}
