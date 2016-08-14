package cap6_COMMAND;

import java.util.List;

public class RemoteControl {
	List<Command> coms;
	Command undoLast;
	
	
	public void setCommands(List<Command> coms){
		this.coms =coms; 
	};
	
	public void buttomPressed(int position){
		if(coms.size()>position  && coms.get(position) != null){
			coms.get(position).execute();
			this.undoLast = coms.get(position);
		}
	};
	
	public void undoPressed(){
		undoLast.undo();
	}
}
