package SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//the serialisation means convertion of java/python ->json and De-serialization is vise-versa
class CandyCrush implements Serializable{
	String name;
	int lever;
	long score;
	int life;

	public CandyCrush() {}

	public CandyCrush(String name, int lever, long score, int life) {
		super();
		this.name = name;
		this.lever = lever;
		this.score = score;
		this.life = life;
	};
}

class GameSeri {
	public static void main(String[] args) throws IOException {
		CandyCrush cc = new CandyCrush("dinesh", 25, 5222, 6);
		FileOutputStream fos = new FileOutputStream("./src/test/resources/game.text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cc);
		System.out.println("==Serialization Successfull==");
	}
}
