package dbFaker.dataModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
public abstract class Model {

	  @Override
	  public abstract String toString();
}
