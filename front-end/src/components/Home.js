import React, { Component } from 'react';
import Bio from './Bio'
import ButtonBases from './ButtonBases'

class Home extends Component {
	
	render() {
		return (
			<div className="root">
				<Bio/>
				<ButtonBases/>
			</div>
		);
	}
}

export default Home;