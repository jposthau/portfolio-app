import React, { Component } from 'react';
import Bio from './Bio'
import ButtonBases from './ButtonBases'
import { withStyles } from '@material-ui/core/styles';

const styles = {
  root: {
    position: 'absolute',
	display: 'flex',
	flexDirection: 'column',
	width: '100%',
  },

};

class BarkSensor extends Component {
	render() {
		const { classes } = this.props;
		return (
			<div className={classes.root}>
				BarkSensor
			</div>
		);
	}
}

export default withStyles(styles)(BarkSensor);