import React, { Component } from 'react';
import Bio from './Bio'
import ButtonBases from './ButtonBases'

const styles = theme => ({
  root: {
    display: 'flex',
    maxWidth: '100vw',
  },
});


class Home extends Component {
	render() {
		return (
			<div className={styles.root}>
				<Bio/>
				<ButtonBases/>
			</div>
		);
	}
}

export default Home;