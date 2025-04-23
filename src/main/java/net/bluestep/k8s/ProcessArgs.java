
package net.bluestep.k8s;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author jamess
 */
public class ProcessArgs {

	private final String yaml;
	private final List<String> args;

	@JsonCreator
	public ProcessArgs(
			@JsonProperty("yaml") String yaml,
			@JsonProperty("args") List<String> args) {
		this.yaml = yaml;
		this.args = Objects.requireNonNull(args, "args must not be null");
	}

	public String getYaml() {
		return yaml;
	}

	public List<String> getArgs() {
		return args;
	}

	@Override
	public String toString() {
		return "ProcessArgs{" +
			" yaml='" + getYaml() + "'" +
			", args='" + getArgs() + "'" +
			"}";
	}

}
