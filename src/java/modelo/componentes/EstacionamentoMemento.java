public class EstacionamentoMemento {
	private Estacionamento config = null;
	private Estacionamento previousState = null;

	public EstacionamentoMemento(Estacionamento config) {
		this.config = config;
		setCurrentState();
	}

	public Estacionamento restoreState() {
		return previousState;
	}

	public void setCurrentState() {
		try {
			this.previousState = (Estacionamento) config.clone();
		} catch (CloneNotSupportedException ex) {
			Logger.getLogger(EstacionamentoMemento.class.getname();
		}
	}
}