import React, { Component } from 'react';
import Project from './Project';

const title = <h2>Raspberry Pi Dog Bark Sensor</h2>;
const desc = <p>Brief discription of the project.............................................................................................................................................................................................................................................</p>;
const img = <div class='img barkSensor'></div>;

class BarkSensor extends Component {
	render() {
		return (
			<Project
				title={title}
				desc={desc}
				img={img}
			/>
		);
	}
}

export default BarkSensor;