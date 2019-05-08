import React, { Component } from 'react';
import Project from './Project';

const title = <h2>Trail Crosswalk Safety Automation</h2>;
const desc = <p>Click <a href='/crosswalkproject.pdf'>here</a> for more info.</p>;
const img = <div class='img crosswalk'></div>;

class Crosswalk extends Component {
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