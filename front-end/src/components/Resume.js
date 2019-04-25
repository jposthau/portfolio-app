import React, { Component } from 'react';
import PDF from 'react-pdf-js';
import resumePDF from '../static/Resume.pdf';
import { withStyles } from '@material-ui/core/styles';

const styles = {
	pdfContainer: {
		display: 'flex',
		justifyContent: 'center',
		margin: '10px 0 0 0',
		width: '100vw',
	},
	pdf: {
		maxWidth: '100vw',
		height: '100vh',
	}
};

class Resume extends Component {
	 	
	render() {
		const { classes } = this.props;
		return (
		  <div className={classes.pdfContainer}>
			<PDF 
			  className={classes.pdf}
			  scale="2"
			  file={resumePDF}
			/>
		  </div>
		)
	}
}

export default withStyles(styles)(Resume);
