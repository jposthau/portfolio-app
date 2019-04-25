import React, { Component } from 'react';
import Bio from './Bio'
import ButtonBases from './ButtonBases'
import { withStyles } from '@material-ui/core/styles';

const styles = {
  root: {
    position: 'absolute',
  },
  bioContainer: {
	  position: 'relative',
  }
};

class Home extends Component {
	
	render() {
		const { classes } = this.props;
		return (
			<div className={classes.root}>
				<div className={classes.bioContainer}>
					<Bio/>
				</div>
				<div className={classes.projectsContainer}>
					<ButtonBases/>
				</div>
			</div>
		);
	}
}

export default withStyles(styles)(Home);
