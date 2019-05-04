import React, { Component } from 'react';
import Project from './Project';

const title = <h2>Bicycle Crosswalk Safety Automation</h2>;
const desc = <p>Brief discription of the project.............................................................................................................................................................................................................................................</p>;
const img = <div class='img crosswalk'></div>;

class Crosswalk extends Component {
	constructor(props) {
		super(props);
	}
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

export default Crosswalk;