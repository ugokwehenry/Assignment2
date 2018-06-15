package henry.ugokwe.assignment.Question7;

public abstract class AquaticInsect implements IInsect,IAquaticInsect
{
	public void Swim()
	{
		System.out.println("Sploosh!");
	}
	public void MoveAntennae()
	{
		System.out.println("Moving my antennae underwater!");
	}
}