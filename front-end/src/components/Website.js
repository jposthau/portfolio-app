import React, { Component } from 'react';
import Project from './Project';

const title = <h2>Full Stack Web Application</h2>;
const desc = <p>Check out my GitHub repo <a href='https://github.com/jposthau/portfolio-app'>here</a>!</p>;
const img = <div class='img website'></div>;

class Website extends Component {
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

export default Website;