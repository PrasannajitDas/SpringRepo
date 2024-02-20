package springcore.DIwithCI;

public class Television {
	Remote remote;
	public Television(Remote remote) {
		this.remote=remote;
	}
	public Remote getRemote() {
		return remote;
	}
	public void setRemote(Remote remote) {
		this.remote = remote;
	}

}
